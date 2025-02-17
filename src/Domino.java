public class Domino {
    private int top;
    private int bottom;

    public Domino() {
        this.top = 0;
        this.bottom = 0;
    }

    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public String toString() {
        return top + "/" + bottom;
    }

    public void flip() {
        int temp = top;
        top = bottom;
        bottom = temp;
    }

    public void settle() {
        if (top > bottom) {
            flip();
        }
    }

    public int compareTo(Domino other) {
        int thisSmallest = Math.min(this.top, this.bottom);
        int otherSmallest = Math.min(other.top, other.bottom);

        if (thisSmallest < otherSmallest) {
            return -1;
        } else if (thisSmallest > otherSmallest) {
            return 1;
        } else {
            int thisLargest = Math.max(this.top, this.bottom);
            int otherLargest = Math.max(other.top, other.bottom);

            if (thisLargest < otherLargest) {
                return -1;
            } else if (thisLargest > otherLargest) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    public int compareToWeight(Domino other) {
        int thisTotal = this.top + this.bottom;
        int otherTotal = other.top + other.bottom;

        if (thisTotal < otherTotal) {
            return -1;
        } else if (thisTotal > otherTotal) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean canConnect(Domino other) {
        return this.top == other.top || this.top == other.bottom ||
                this.bottom == other.top || this.bottom == other.bottom;
    }
}




