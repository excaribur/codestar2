class Work {
    void sort(int[] data) {
        sort(data, 0, data.length - 1);
    }
    void sort(int[] data, int left, int right) {
        if (left >= right) return;
        int p = partition(data, left, right);
        sort(data, left, p -1);
        sort(data, p + 1, right);
    }
    int partition(int[] data, int left, int right) {
        int divider = left + 1;
        for (int i = left + 1; i < data.length; i++) {
             if (data[i] < data[left]) {
                 int t = data[i];
                 data[i] = data[divider];
                 data[divider] = t;
                 divider++;
             }
        }
        int t = data[left];
        data[left] = data[divider -1];
        data[divider - 1] = t;
        return divider - 1;
    }
}
