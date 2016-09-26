import eu.mihosoft.vrl.v3d.parametrics.*;

ArrayList<CSG> makeFighter(){
double xWidth = 30;
double yWidth = 30;

LengthParameter thickness= new LengthParameter("Thickness",3,[19.0,1.0])

CSG pieceOne = new Cylinder(	xWidth/2+1, 
                       	yWidth/2+1, 
                       	thickness.getMM(),
                       	(int)50
                     	).toCSG()
                     	


CSG pieceTo = new Cube(	xWidth, 
                       	thickness.getMM(), 
                       	yWidth
                     	).toCSG()


CSG pieceTwo = new Cylinder(xWidth/2, 
                       	 	yWidth/2, 
                       	 	thickness.getMM()/2,
                       	 	(int)50
                     	 	).toCSG()

pieceOne = pieceOne.difference(pieceTwo.movex(-3*xWidth/4))
pieceTwo = pieceTwo.difference(pieceOne.movex(-3*xWidth/4))

pieceTwo = pieceTwo.movex(-xWidth)
				.toZMin()
				.toXMin()
pieceOne = pieceOne .movex(xWidth/2)
                    .movey(yWidth/2+20)
                    .toZMin()
				
def listOfParts = [pieceOne, pieceTwo]
for(int i = 0; i <listOfParts.size();i++){
	int local = i;
	listOfParts.get(local)
		.setParameter(thickness)
		.setRegenerate({
			return makeFighter().get(local)
		})
	}


return listOfParts
}

return makeFighter()