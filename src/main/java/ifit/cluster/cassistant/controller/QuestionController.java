package ifit.cluster.cassistant.controller;

import ifit.cluster.cassistant.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;
}