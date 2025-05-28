def longest_balanced_subarray(arr):
    balance_map = {0: -1}
    balance = 0
    max_len = 0

    for i, num in enumerate(arr):
        if num % 2 == 0:
            balance += 1
        else:
            balance -= 1

        if balance in balance_map:
            length = i - balance_map[balance]
            max_len = max(max_len, length)
        else:
            balance_map[balance] = i

    return max_len
