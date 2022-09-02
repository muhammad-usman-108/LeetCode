class Solution:
    def mergeSimilarItems(self, items1: List[List[int]], items2: List[List[int]]) -> List[List[int]]:
        temp = {}
        res = []
        
        for i in range(0, len(items1)):
            temp[items1[i][0]] = items1[i][1]
        
        for i in range(0, len(items2)):
            if items2[i][0] in temp.keys():
                temp[items2[i][0]] = temp[items2[i][0]] + items2[i][1]
            else:
                temp[items2[i][0]] = items2[i][1]
        
        for key in temp.keys():
            res.append([key, temp[key]])
        
        return sorted(res)