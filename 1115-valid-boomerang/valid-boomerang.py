class Solution(object):
    def isBoomerang(self, points):
        (x1, y1), (x2, y2), (x3, y3) = points

        # Check for distinct points
        if (x1 == x2 and y1 == y2) or (x1 == x3 and y1 == y3) or (x2 == x3 and y2 == y3):
            return False

        # Check if the area of the triangle formed by the 3 points is non-zero (not collinear)
        area = (x2 - x1)*(y3 - y1) - (x3 - x1)*(y2 - y1)
        return area != 0
        