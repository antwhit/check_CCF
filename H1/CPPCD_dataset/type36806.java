    public void paintCpnt(Graphics gra) {
        super.paintCpnt(gra);
        int x1, y1, x2, y2;
        for (int c = 0; c < parent.getNumShapes(); c++) {
            for (int point = 0; point < parent.myShape[c].getNumPoints(); point++) {
                x1 = parent.myShape[c].getPoint(point).getX() + parent.myShape[c].getX() + 4;
                y1 = parent.myShape[c].getPoint(point).getY() + parent.myShape[c].getY() + 23;
                for (int adjPt = 0; (adjPt < point) && (adjPt < parent.myShape[c].getPoint(point).getNumAdjPt()); adjPt++) {
                    x2 = parent.myShape[c].getPoint(point).getAdjPt(adjPt).getX() + parent.myShape[c].getPoint(point).getAdjPt(adjPt).getParentObj().getX() + 4;
                    y2 = parent.myShape[c].getPoint(point).getAdjPt(adjPt).getY() + parent.myShape[c].getPoint(point).getAdjPt(adjPt).getParentObj().getY() + 23;
                    gra.drawLine(x1 - 4, y1 - 23, x2 - 4, y2 - 23);
                }
            }
        }
        System.out.println(" " + x1 + " " + y1 + " " + x2 + " " + y2);
    }