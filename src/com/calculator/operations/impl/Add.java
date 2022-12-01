package com.calculator.operations.impl;

import com.calculator.operation.Operate;
public class Add implements Operate{
    @Override
    public Double getResult(Double... numbers) {
        Double sum = 0.0;

        for(Double num : numbers) {
            sum += num;
        }

        return sum;
    }

}
