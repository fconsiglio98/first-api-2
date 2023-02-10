package it.develhope.First.API2.controllers;

import org.apache.commons.math3.util.CombinatoricsUtils;
import org.springframework.web.bind.annotation.*;

import java.math.MathContext;

@RestController
@RequestMapping(value = "/factorial")
public class FactorialController {

    @GetMapping(value = "/{n}")
    public long MyFactorial(@PathVariable(required = false, value = "n") int n){
        return CombinatoricsUtils.factorial(n);
    }
}
