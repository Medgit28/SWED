def ulam_terminates(n, memo={}):
    original = n
    steps = []

    while n != 1:
        if n in memo:
            memo[original] = True
            return True
        steps.append(n)
        if n % 2 == 0:
            n //= 2
        else:
            n = 3 * n + 1

    for s in steps:
        memo[s] = True
    return True

for i in range(1, 1_000_000):
    if not ulam_terminates(i):
        print("Ulam failed for", i)
        break
else:
    print("All numbers < one million terminate at 1.")
