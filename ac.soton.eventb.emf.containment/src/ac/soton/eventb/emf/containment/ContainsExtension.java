/*******************************************************************************
 * Copyright (c) 2017,2020 University of Southampton.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *
 * $Id$
 *******************************************************************************/
package ac.soton.eventb.emf.containment;

import ac.soton.eventb.emf.diagrams.Diagram;
import org.eventb.emf.core.AbstractExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contains Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.containment.ContainsExtension#getName <em>Name</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.containment.ContainsExtension#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.containment.ContainmentPackage#getContainsExtension()
 * @model
 * @generated
 */
public interface ContainsExtension extends AbstractExtension {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ac.soton.eventb.emf.containment.ContainmentPackage#getContainsExtension_Name()
	 * @model default="" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.containment.ContainsExtension#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' reference.
	 * @see #setExtension(Diagram)
	 * @see ac.soton.eventb.emf.containment.ContainmentPackage#getContainsExtension_Extension()
	 * @model
	 * @generated
	 */
	Diagram getExtension();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.containment.ContainsExtension#getExtension <em>Extension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(Diagram value);

} // ContainsExtension
