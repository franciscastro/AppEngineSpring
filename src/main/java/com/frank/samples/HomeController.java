package com.frank.samples;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 *
 * @author Frank Lloyd Teh
 */
@Controller
public class HomeController {

    private static final Logger log = Logger.getLogger(HomeController.class.getName());

    @RequestMapping(value = "/")
    public ModelAndView home() {

        log.log(Level.INFO, "HomeController: Passing through...");

        return new ModelAndView("/home");
    }

}
