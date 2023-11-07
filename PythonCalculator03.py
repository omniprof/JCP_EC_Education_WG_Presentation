class PythonCalculator03:
    def func_input(self):
        loan = float(input("           loan: "))
        interest = float(input("       interest: "))
        term = float(input("           term: "))
        return loan, interest, term
    def func_process(self, input_data):
        (loan, interest, term) = input_data
        temp_interest = float(interest) / 12;
        return loan * (temp_interest / (1 - ((1 + temp_interest) ** -term)));
    def func_output(self, result):
        print('Monthly Payment: %.2f' % result)
    def func_work(self):
        input_data = self.func_input()
        result = self.func_process(input_data)
        self.func_output(result)
worker = PythonCalculator03()
worker.func_work()
