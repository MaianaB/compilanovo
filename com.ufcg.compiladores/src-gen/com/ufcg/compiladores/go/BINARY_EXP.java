/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BINARY EXP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.BINARY_EXP#getBasic <em>Basic</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.BINARY_EXP#getVarCal <em>Var Cal</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.BINARY_EXP#getFunc <em>Func</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.BINARY_EXP#getBool <em>Bool</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.BINARY_EXP#getArit <em>Arit</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getBINARY_EXP()
 * @model
 * @generated
 */
public interface BINARY_EXP extends EObject
{
  /**
   * Returns the value of the '<em><b>Basic</b></em>' containment reference list.
   * The list contents are of type {@link com.ufcg.compiladores.go.LITERAIS_BASICOS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic</em>' containment reference list.
   * @see com.ufcg.compiladores.go.GoPackage#getBINARY_EXP_Basic()
   * @model containment="true"
   * @generated
   */
  EList<LITERAIS_BASICOS> getBasic();

  /**
   * Returns the value of the '<em><b>Var Cal</b></em>' containment reference list.
   * The list contents are of type {@link com.ufcg.compiladores.go.VarCall}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Cal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Cal</em>' containment reference list.
   * @see com.ufcg.compiladores.go.GoPackage#getBINARY_EXP_VarCal()
   * @model containment="true"
   * @generated
   */
  EList<VarCall> getVarCal();

  /**
   * Returns the value of the '<em><b>Func</b></em>' containment reference list.
   * The list contents are of type {@link com.ufcg.compiladores.go.FunctionCall}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' containment reference list.
   * @see com.ufcg.compiladores.go.GoPackage#getBINARY_EXP_Func()
   * @model containment="true"
   * @generated
   */
  EList<FunctionCall> getFunc();

  /**
   * Returns the value of the '<em><b>Bool</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool</em>' containment reference.
   * @see #setBool(BOOL_OP)
   * @see com.ufcg.compiladores.go.GoPackage#getBINARY_EXP_Bool()
   * @model containment="true"
   * @generated
   */
  BOOL_OP getBool();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.BINARY_EXP#getBool <em>Bool</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool</em>' containment reference.
   * @see #getBool()
   * @generated
   */
  void setBool(BOOL_OP value);

  /**
   * Returns the value of the '<em><b>Arit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arit</em>' attribute.
   * @see #setArit(String)
   * @see com.ufcg.compiladores.go.GoPackage#getBINARY_EXP_Arit()
   * @model
   * @generated
   */
  String getArit();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.BINARY_EXP#getArit <em>Arit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arit</em>' attribute.
   * @see #getArit()
   * @generated
   */
  void setArit(String value);

} // BINARY_EXP
