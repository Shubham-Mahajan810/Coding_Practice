const calculator = {
     displayValue: '0',
     firstOperand: null,
     waitingForSecondOperand: false,
     operator: null,
   };
   
   function updateDisplay() {
     const display = document.querySelector('.calculator-screen');
     display.value = calculator.displayValue;
   }
   
   function handleKeyPress(event) {
     const { target } = event;
     const { value } = target;
     if (!target.matches('button')) {
       return;
     }
   
     switch (value) {
       case '+':
       case '-':
       case '*':
       case '/':
         handleOperator(value);
         break;
       case '=':
         calculate();
         break;
       case '.':
         inputDecimal(value);
         break;
       case 'all-clear':
         resetCalculator();
         break;
       default:
         if (Number.isInteger(parseFloat(value))) {
           inputDigit(value);
         }
     }
   
     updateDisplay();
   }
   
   function inputDigit(digit) {
     const { displayValue, waitingForSecondOperand } = calculator;
   
     if (waitingForSecondOperand === true) {
       calculator.displayValue = digit;
       calculator.waitingForSecondOperand = false;
     } else {
       calculator.displayValue = displayValue === '0' ? digit : displayValue + digit;
     }
   }
   
   function inputDecimal(dot) {
     if (calculator.waitingForSecondOperand) return;
   
     if (!calculator.displayValue.includes(dot)) {
       calculator.displayValue += dot;
     }
   }
   
   function handleOperator(nextOperator) {
     const { firstOperand, displayValue, operator } = calculator;
     const inputValue = parseFloat(displayValue);
   
     if (operator && calculator.waitingForSecondOperand) {
       calculator.operator = nextOperator;
       return;
     }
   
     if (firstOperand == null) {
       calculator.firstOperand = inputValue;
     } else if (operator) {
       const currentValue = firstOperand || 0;
       const result = performCalculation[operator](currentValue, inputValue);
   
       calculator.displayValue = String(result);
       calculator.firstOperand = result;
     }
   
     calculator.waitingForSecondOperand = true;
     calculator.operator = nextOperator;
   }
   
   const performCalculation = {
     '/': (firstOperand, secondOperand) => firstOperand / secondOperand,
     '*': (firstOperand, secondOperand) => firstOperand * secondOperand,
     '+': (firstOperand, secondOperand) => firstOperand + secondOperand,
     '-': (firstOperand, secondOperand) => firstOperand - secondOperand,
     '=': (firstOperand, secondOperand) => secondOperand,
   };
   
   function calculate() {
     const { firstOperand, displayValue, operator } = calculator;
     const secondOperand = parseFloat(displayValue);
   
     if (operator && firstOperand != null) {
       const result = performCalculation[operator](firstOperand, secondOperand);
       calculator.displayValue = String(result);
       calculator.firstOperand = result;
       calculator.operator = null;
       calculator.waitingForSecondOperand = false;
     }
   }
   
   function resetCalculator() {
     calculator.displayValue = '0';
     calculator.firstOperand = null;
     calculator.waitingForSecondOperand = false;
     calculator.operator = null;
   }
   
   document.querySelector('.calculator-keys').addEventListener('click', handleKeyPress);
   
   updateDisplay();
   