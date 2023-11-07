def func_input():
    global loan
    loan = float(input("           loan: "))
    global interest
    interest = float(input("       interest: "))
    global term
    term = float(input("           term: "))


def func_process():
    tempInterest = float(interest) / 12.0;
    global result
    result = loan * (tempInterest / (1.0 - ((1.0 + tempInterest) ** -term)));


def func_output():
    print('Monthly Payment: %.2f' % result)

func_input()
func_process()
func_output()
