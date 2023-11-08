loan = 1000.0
interest 0.05
term = 5
tempInterest = float(interest) / 12;
result = float(loan) * \
         (tempInterest / (1.0 - ((1.0 + tempInterest) ** -float(term))));
print("Monthly Payment: %.2f" % result)

