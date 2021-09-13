class ATM {

    public int countBanknotes(int sum) {

        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int res = 0;
        int i = 0;
        while (sum > 0) {

            res += sum / banknotes[i];
            sum = sum % banknotes[i];
            i++;
        }
        return res;

    }

}