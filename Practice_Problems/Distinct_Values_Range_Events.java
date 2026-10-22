import java.io.*;
public class Distinct_Values_Range_Events {
    static int[] head;
    static int[] next;
    static int[] value;
    static int eventCount = 0;

    static void addEvent(int position, int eventValue) {
        ++eventCount;
        value[eventCount] = eventValue;
        next[eventCount] = head[position];
        head[position] = eventCount;
    }

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner(System.in);

        int n = fs.nextInt();
        int q = fs.nextInt();

        head = new int[n + 2];
        next = new int[2 * q + 1];
        value = new int[2 * q + 1];

        for (int i = 0; i < q; i++) {
            int l = fs.nextInt();
            int r = fs.nextInt();
            int x = fs.nextInt();

            addEvent(l, x);
            addEvent(r + 1, -x);
        }

        int[] active = new int[q + 1];
        int distinct = 0;
        StringBuilder answer = new StringBuilder();

        for (int position = 1; position <= n; position++) {
            for (int e = head[position]; e != 0; e = next[e]) {
                int event = value[e];

                if (event > 0) {
                    int x = event;

                    if (active[x] == 0) {
                        distinct++;
                    }
                    active[x]++;
                } else {
                    int x = -event;

                    active[x]--;
                    if (active[x] == 0) {
                        distinct--;
                    }
                }
            }

            if (position > 1) {
                answer.append(' ');
            }
            answer.append(distinct);
        }

        System.out.println(answer);
    }

    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int pointer = 0;
        private int length = 0;

        FastScanner(InputStream in) {
            this.in = in;
        }

        private int read() throws IOException {
            if (pointer >= length) {
                length = in.read(buffer);
                pointer = 0;

                if (length <= 0) {
                    return -1;
                }
            }
            return buffer[pointer++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = read();
            } while (c != -1 && c <= ' ');

            int result = 0;
            while (c > ' ') {
                result = result * 10 + (c - '0');
                c = read();
            }
            return result;
        }
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Difference-array / sweep-line idea: add event at l and remove at r+1, then sweep positions keeping a count per value.
   Uses a linked-list-in-arrays (head/next) and a fast input reader for speed.
   ========================================================== */
