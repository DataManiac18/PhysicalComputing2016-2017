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
                     	
CSG pieceThree = new Cube(	thickness.getMM(), 
                       	yWidth, 
                       	xWidth
                     	).toCSG()


CSG pieceTwo = new Cube(yWidth, 
                       	 	thickness.getMM(), 
                       	 	xWidth
                     	 	).toCSG()
CSG leg = new Cylinder(4, 
                       	2, 
                       	xWidth+thickness.getMM(),
                       	(int)20
                     	).toCSG()
                     	 .movex(5)
                     	 .movey(5)
pieceOne = pieceOne.difference(leg.movez(-xWidth+2))
pieceTwo = pieceTwo.difference(pieceOne.movex(-3.6*xWidth/4))
pieceOne = pieceOne.difference(pieceTwo.movex(-3*xWidth/4))
pieceThree = pieceThree.difference(pieceOne.movey(-3.6*yWidth/4))
pieceOne = pieceOne.difference(pieceThree.movey(-3*yWidth/4))
pieceTwo = pieceTwo .toXMin()
				.toZMin()
				.movex(10+thickness.getMM())
				.rotx(90)
pieceOne = pieceOne .movex(xWidth/2)
                    .movey(yWidth/2+40)
                    .toZMin()
pieceThree = pieceThree .movex(-xWidth)
				.toZMin()
				.toXMin()
				.movey(15)
				.roty(90);
leg = leg.movex(50)
	    .movey(30)


                     	
def listOfParts = [pieceOne,leg, pieceThree, pieceTwo]
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

/*
 * pieceOne = pieceOne .movex(xWidth/2)
                    .movey(yWidth/2+20)
                    .toZMin()
pieceThree = pieceThree .movex(-xWidth)
				.toZMin()
				.toXMin()
				.movey(15)
 */