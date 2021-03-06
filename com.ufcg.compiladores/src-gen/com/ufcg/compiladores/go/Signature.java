/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.Signature#getParams <em>Params</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.Signature#getRetorno <em>Retorno</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getSignature()
 * @model
 * @generated
 */
public interface Signature extends EObject
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference.
   * @see #setParams(Parameters)
   * @see com.ufcg.compiladores.go.GoPackage#getSignature_Params()
   * @model containment="true"
   * @generated
   */
  Parameters getParams();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.Signature#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(Parameters value);

  /**
   * Returns the value of the '<em><b>Retorno</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Retorno</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Retorno</em>' containment reference.
   * @see #setRetorno(Types)
   * @see com.ufcg.compiladores.go.GoPackage#getSignature_Retorno()
   * @model containment="true"
   * @generated
   */
  Types getRetorno();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.Signature#getRetorno <em>Retorno</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Retorno</em>' containment reference.
   * @see #getRetorno()
   * @generated
   */
  void setRetorno(Types value);

} // Signature
