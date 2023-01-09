    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int com = 0;
        int pt = 0;
        int adjPt = 0;
        int x1, y1, x2, y2;
        for (com = 0; com < parent.getNumShapes(); com++) {
            for (pt = 0; pt < parent.myShape[com].getNumPoints(); pt++) {
                x1 = parent.myShape[com].getPoint(pt).getX() + parent.myShape[com].getX() + 4;
                y1 = parent.myShape[com].getPoint(pt).getY() + parent.myShape[com].getY() + 23;
                for (adjPt = 0; (adjPt < pt) && (adjPt < parent.myShape[com].getPoint(pt).getNumAdjPt()); adjPt++) {
                    x2 = parent.myShape[com].getPoint(pt).getAdjPt(adjPt).getX() + parent.myShape[com].getPoint(pt).getAdjPt(adjPt).getParentObj().getX() + 4;
                    y2 = parent.myShape[com].getPoint(pt).getAdjPt(adjPt).getY() + parent.myShape[com].getPoint(pt).getAdjPt(adjPt).getParentObj().getY() + 23;
                    g.drawLine(x1 - 4, y1 - 23, x2 - 4, y2 - 23);
                }
            }
        }
    }