class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        words = s.strip().split(" ")
        # Handle cases where the string is empty or contains only spaces
        if not words or words == ['']:
            return 0
        return len(words[-1])

st = "   fly me   to   the moon  "
solver = Solution()
result = solver.lengthOfLastWord(st)
print(result)
