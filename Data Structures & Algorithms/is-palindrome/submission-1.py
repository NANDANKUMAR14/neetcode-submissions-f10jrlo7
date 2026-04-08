class Solution:
    def isPalindrome(self, s: str) -> bool:
        res = ''.join(ch for ch in s if ch.isalnum())
        res=res.lower()
        rev=res[::-1]
        if rev == res:
            return True
        else:
            return False