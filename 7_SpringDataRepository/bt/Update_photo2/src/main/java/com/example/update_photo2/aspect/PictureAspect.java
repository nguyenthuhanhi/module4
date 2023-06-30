package com.example.update_photo2.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class PictureAspect {
    private Logger logger = Logger.getLogger(PictureAspect.class.getName());
}