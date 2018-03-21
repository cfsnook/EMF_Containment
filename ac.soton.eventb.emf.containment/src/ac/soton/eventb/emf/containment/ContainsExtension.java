/**
 * Copyright (c) 2017 University of Southampton.
 * 
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 *
 * $Id$
 */
package ac.soton.eventb.emf.containment;

import org.eclipse.emf.common.util.EList;

import org.eventb.emf.core.AbstractExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contains Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.containment.ContainsExtension#getExtension <em>Extension</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.containment.ContainsExtension#getNames <em>Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.containment.ContainmentPackage#getContainsExtension()
 * @model
 * @generated
 */
public interface ContainsExtension extends AbstractExtension {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' reference.
	 * @see #setExtension(AbstractExtension)
	 * @see ac.soton.eventb.emf.containment.ContainmentPackage#getContainsExtension_Extension()
	 * @model
	 * @generated
	 */
	AbstractExtension getExtension();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.containment.ContainsExtension#getExtension <em>Extension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(AbstractExtension value);

	/**
	 * Returns the value of the '<em><b>Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Names</em>' attribute list.
	 * @see ac.soton.eventb.emf.containment.ContainmentPackage#getContainsExtension_Names()
	 * @model default=""
	 * @generated
	 */
	EList<String> getNames();

} // ContainsExtension
