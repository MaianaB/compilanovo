/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.ArrayValue#getLit <em>Lit</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getArrayValue()
 * @model
 * @generated
 */
public interface ArrayValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Lit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lit</em>' containment reference.
   * @see #setLit(LiteraisList)
   * @see com.ufcg.compiladores.go.GoPackage#getArrayValue_Lit()
   * @model containment="true"
   * @generated
   */
  LiteraisList getLit();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.ArrayValue#getLit <em>Lit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lit</em>' containment reference.
   * @see #getLit()
   * @generated
   */
  void setLit(LiteraisList value);

} // ArrayValue
