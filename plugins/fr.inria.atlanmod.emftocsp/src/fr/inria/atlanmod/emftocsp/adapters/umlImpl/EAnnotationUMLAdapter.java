/*******************************************************************************
 * Copyright (c) 2013 INRIA Rennes Bretagne-Atlantique.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     INRIA Rennes Bretagne-Atlantique - initial API and implementation
 *******************************************************************************/
package fr.inria.atlanmod.emftocsp.adapters.umlImpl;

import fr.inria.atlanmod.emftocsp.adapters.EAnnotationAdapter;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;


/**
 * @author <a href="mailto:amine.benelallam@inria.fr">Amine Benelallam</a>
 *
 */
public class EAnnotationUMLAdapter extends EAnnotationAdapter<EAnnotation> {

	protected Resource owningResource;
	
	public EAnnotationUMLAdapter(EAnnotation newEAnnotation, Resource owningResource) {
		super(newEAnnotation);
		this.owningResource = owningResource;
	}

	
	@Override
	public String getSource() {
		return origEAnnotation.getSource();
	}

	@Override
	public EMap<String, String> getDetails() {
		return origEAnnotation.getDetails();
	}

	@Override
	public EModelElement getEModelElement() {
		
		EModelElement element = origEAnnotation.getEModelElement();
			if (element instanceof Operation)
				return new EOperationUMLAdapter((Operation) element,owningResource);
			if (element instanceof Classifier)
				if (element instanceof Class) return ((EResourceUMLAdapter)owningResource).getClassIfNotExists(new EClassUMLAdapter((Class)element,owningResource));
				else return ((EResourceUMLAdapter)owningResource).getClassIfNotExists(new EClassifierUMLAdapter((Classifier)element,owningResource));
			if (element instanceof Property)
				return new EStructuralFeatureUMLAdapter((Property)element,owningResource);
		return origEAnnotation.getEModelElement();
	}

}
