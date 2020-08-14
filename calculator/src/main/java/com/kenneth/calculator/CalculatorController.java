@RestController
class CalculatorController {
    @Autowired
    private Calculator calculator;
    @RequestMapping("/sum")
    String sum(@RequestParam("a") Integer a,
               @RequestParam("b") Integer b) {
        return String.valueOf(calculator.sum(a, b));
    }
}
