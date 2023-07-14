package com.example.borrow_books.controller;


import com.example.borrow_books.entity.Book;
import com.example.borrow_books.entity.BookCode;
import com.example.borrow_books.service.IBookCodeService;
import com.example.borrow_books.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;

    @Autowired
    private IBookCodeService bookCodeService;

    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("books   ",new Book());
        return"/list";
    }
    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("book", new Book());
        return "/create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute("book") Book book, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            return "/create";
        }
        bookService.save(book);
        return "redirect:/list";
    }
    @GetMapping("/borrow/{book_id}")
    public String showBorrow(@PathVariable("book_id") int book_id, Model model) {
        Book book=bookService.findById(book_id);
        model.addAttribute("book", bookService.findById(book_id));
        if (book.getQuantity()<=0){
            model.addAttribute("error","Tất cả sách đã được mượn");
            model.addAttribute("books", bookService.findAll());
            return "/list";
        }
        model.addAttribute("codes", bookCodeService.findAllCodeByBookIdAndNotBorrowed(bookId));
        return "/borrow";
    }

    @GetMapping("/return")
    public String showReturn() {
        return "/return";
    }

    @GetMapping("/doBorrow/{idCode}")
    public String doBorrow(@PathVariable("idCode") int id) {
        BookCode code = bookCodeService.findById(id);
        Book book = bookService.findById(code.getBook().getBook_id());
        bookService.borrow(book, code.getBook_code());
        return "redirect:/list";
    }

    @PostMapping("/doReturn")
    public String doReturn(@RequestParam("code") int code,Model model) {
        Code code1 = iCodeService.findByCode(code);
        if (code1==null){
            model.addAttribute("erorr","Không tìm thấy sách có mã vừa nhập");
            return "/return";
        }
        if (!code1.getStatus().equals("borrowed")){
            model.addAttribute("erorr","Sách này đã được mượn");
            return "/return";
        }
        Book book=iBookService.findById(code1.getBook().getBookId());
        iBookService.returnBook(book,code);
        return "redirect:/list";
    }

}
