class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = []
        if numRows>=1:
            res.append([1])
        if numRows>=2:
            res.append([1,1])
            
        if numRows>2:
            for i in range(2, numRows):
                size = len(res)
                temp = [1]
                for index in range(0, len(res[size-1])):
                    if index == (len(res[size-1]) - 1):
                        temp.append(1)
                    else:
                        temp.append(res[size-1][index] + res[size-1][index+1])
                res.append(temp)
                        
        return res