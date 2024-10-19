filename = "science.csv"

with open(filename, "r") as f:
    for line in f:
        items = line.strip().split(',')
        scores = [eval(items[i]) for i in range(3, 7)]
        for score in scores:
            