class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        res = []
        if rowIndex==0:
            return [1]
        if rowIndex==1:
            return [1,1]
            
        if rowIndex>1:
            res.append([1])
            res.append([1,1])
            for i in range(1, rowIndex+1):
                size = len(res)
                temp = [1]
                for index in range(0, len(res[size-1])):
                    if index == (len(res[size-1]) - 1):
                        temp.append(1)
                    else:
                        temp.append(res[size-1][index] + res[size-1][index+1])
                res.append(temp)
                if rowIndex-1 == i:
                    return temp