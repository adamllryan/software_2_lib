import numpy as np


def gaussian(x, mu, sig):
    return (
        1.0 / (np.sqrt(2.0 * np.pi) * sig) * np.exp(-np.power((x - mu) / sig, 2.0) / 2)
    )


data = [54.5, 94.3, 75.9, 38.7, 77.5]

# compute gaussian for each data point
p11 = []
p21 = []
for i in range(len(data)):
    val1 = gaussian(data[i], 40, 20)
    val1 = val1 / (val1 + gaussian(data[i], 80, 20))
    val2 = 1 - val1
    p11.append(val1)
    p21.append(val2)
# round to 3
p11 = np.round(p11, 3)
p21 = np.round(p21, 3)
print("P(C1|X) | P(C2|X)")
print("-----------------")
for i in range(len(data)):
    print("|", p11[i], "|", p21[i], "|")
print("-----------------")

""" Calculate pi """

pi1, pi2 = sum(p11), sum(p21)

pi1 = np.round(pi1 / 5, 3)
pi2 = np.round(pi2 / 5, 3)
print("Pi1: ", pi1)
print("Pi2: ", pi2)

""" Calculate mean """

mean1, mean2 = 0, 0
for i in range(len(data)):
    mean1 += data[i] * p11[i]
mean1 /= sum(p11)
print("Mean1: ", np.round(mean1, 1))
mean2 = 0
for i in range(len(data)):
    mean2 += data[i] * p21[i]
mean2 /= sum(p21)
# round to 1 decimal place
mean1 = np.round(mean1, 1)
mean2 = np.round(mean2, 1)
print("Mean2: ", np.round(mean2, 1))

""" Calculate standard deviations """

std1, std2 = 0, 0
for i in range(len(data)):
    std1 += p11[i] * (data[i] - mean1) ** 2
    std2 += p21[i] * (data[i] - mean2) ** 2
std1 = np.sqrt(std1 / sum(p11))
std2 = np.sqrt(std2 / sum(p21))

print("Std1: ", np.round(std1, 2))
print("Std2: ", np.round(std2, 2))

""" Calculate new gaussians """

p12 = []
p22 = []

for i in range(len(data)):
    val1 = gaussian(data[i], mean1, std1)
    val1 = val1 / (val1 + gaussian(data[i], mean2, std2))
    val2 = 1 - val1
    p12.append(val1)
    p22.append(val2)


print("P(C1|X) | P(C2|X)")
print("-----------------")
for i in range(len(data)):
    print("|", p12[i], "|", p22[i], "|")
print("-----------------")
