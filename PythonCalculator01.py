loan = input("           loan: ")
interest = input("       interest: ")
term = input("           term: ")
tempInterest = float(interest) / 12;
result = float(loan) * \
         (tempInterest / (1.0 - ((1.0 + tempInterest) ** -float(term))));
print("Monthly Payment: %.2f" % result)
