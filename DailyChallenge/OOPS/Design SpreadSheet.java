
class Spreadsheet {
    private int [][] sheet;

    public Spreadsheet(int rows) {
        sheet = new int [rows][26]; 
    }
    
    public void setCell(String cell, int value) {
        char c = cell.charAt(0);
        int col = c - 'A';
        int row = Integer.parseInt(cell.substring(1)) - 1; 
        if (row >= sheet.length || col >= sheet[0].length) return;
        sheet[row][col] = value;
    }
    
    public void resetCell(String cell) {
        char c = cell.charAt(0);
        int col = c - 'A';
        int row = Integer.parseInt(cell.substring(1)) - 1;
        if (row >= sheet.length || col >= sheet[0].length) return;
        sheet[row][col] = 0;
    }
    
    public int getValue(String formula) {
        String str = formula.substring(1); 
        String[] arr = str.split("\\+");
       // System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (String s : arr) {
            int check = check(s);
            if (check != -1) { 
                int col = s.charAt(0) - 'A';
                int row = Integer.parseInt(s.substring(1)) - 1;
                if (row < sheet.length && col < sheet[0].length) {
                    sum += sheet[row][col];
                }
            } else { 
                sum += Integer.parseInt(s);
            }
        }
        return sum;
    }

    private static int check(String s) {
        char c = s.charAt(0);
        int val = c - 'A';
        return (val >= 0 && val < 26) ? val : -1;
    }
}
