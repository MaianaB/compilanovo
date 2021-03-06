/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PARAMETERS LIST</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.PARAMETERS_LIST#getParams <em>Params</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.PARAMETERS_LIST#getVir <em>Vir</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getPARAMETERS_LIST()
 * @model
 * @generated
 */
public interface PARAMETERS_LIST extends EObject
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link com.ufcg.compiladores.go.PARAMETER}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see com.ufcg.compiladores.go.GoPackage#getPARAMETERS_LIST_Params()
   * @model containment="true"
   * @generated
   */
  EList<PARAMETER> getParams();

  /**
   * Returns the value of the '<em><b>Vir</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vir</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vir</em>' attribute list.
   * @see com.ufcg.compiladores.go.GoPackage#getPARAMETERS_LIST_Vir()
   * @model unique="false"
   * @generated
   */
  EList<String> getVir();

} // PARAMETERS_LIST
