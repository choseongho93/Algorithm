import sys
input = sys.stdin.readline

def sloveFun(n, m):
    return (n-1) + n * (m-1)

if __name__ == "__main__":
        n, m = map(int, input().strip().split())
        print(sloveFun(n, m))

    