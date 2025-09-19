from typing import List
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        l=len(nums)
        for i in range(l):
            for j in range(i+1,l):
                if(nums[i]+nums[j]==target):
                    return([i,j])
                else:
                    continue
my_nums = eval(input("Enter the list of numbers: "))
my_target = int(input("Enter the target sum: "))

solver=Solution()
result = solver.twoSum(my_nums, my_target)
print(result)
        