class Solution {
    public String convert(String s, int numRows) {
        // If only one row or fewer rows than characters, return original string
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Create StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int index = 0;
        int step = 1; // direction: down = +1, up = -1

        for (char c : s.toCharArray()) {
            rows[index].append(c);

            // Change direction if we hit top or bottom
            if (index == 0) {
                step = 1;
            } else if (index == numRows - 1) {
                step = -1;
            }

            index += step;
        }

        // Join all rows into final result
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
