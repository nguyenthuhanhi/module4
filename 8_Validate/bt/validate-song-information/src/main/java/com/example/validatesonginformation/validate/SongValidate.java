package com.example.validatesonginformation.validate;
import com.example.validatesonginformation.entity.Song;
import com.example.validatesonginformation.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class SongValidate implements Validator {


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (!(target instanceof Song)) {
            return;
        }

            errors.rejectValue("id","Duplicate", null, "ID bị trùng lặp");

    }
}
