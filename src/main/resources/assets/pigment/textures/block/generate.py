import os

colors = ['', 'brown', 'red', 'white', 'yellow', 'purple', 'pink', 'blue', 'cyan', 'gray', 'green', 'light_blue', 'light_gray', 'lime', 'magenta', 'orange', 'black']
name = input("Name your block: ")

for i in range(17):
    realCount = (i + 1)
    color = colors[i]
    
    print(realCount, color)
    os.rename(name + str(realCount) + ".png", color + '_' + name + ".png")
    
input()