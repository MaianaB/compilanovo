/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiler.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FUNCAO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiler.go.FUNCAO#getFunc <em>Func</em>}</li>
 *   <li>{@link com.ufcg.compiler.go.FUNCAO#getNome <em>Nome</em>}</li>
 *   <li>{@link com.ufcg.compiler.go.FUNCAO#getABRE_PARENTESES <em>ABRE PARENTESES</em>}</li>
 *   <li>{@link com.ufcg.compiler.go.FUNCAO#getPARAMETERS_LIST <em>PARAMETERS LIST</em>}</li>
 *   <li>{@link com.ufcg.compiler.go.FUNCAO#getFECHA_PARENTESES <em>FECHA PARENTESES</em>}</li>
 *   <li>{@link com.ufcg.compiler.go.FUNCAO#getBloco <em>Bloco</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiler.go.GoPackage#getFUNCAO()
 * @model
 * @generated
 */
public interface FUNCAO extends EObject
{
  /**
   * Returns the value of the '<em><b>Func</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' attribute.
   * @see #setFunc(String)
   * @see com.ufcg.compiler.go.GoPackage#getFUNCAO_Func()
   * @model
   * @generated
   */
  String getFunc();

  /**
   * Sets the value of the '{@link com.ufcg.compiler.go.FUNCAO#getFunc <em>Func</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' attribute.
   * @see #getFunc()
   * @generated
   */
  void setFunc(String value);

  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see com.ufcg.compiler.go.GoPackage#getFUNCAO_Nome()
   * @model
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link com.ufcg.compiler.go.FUNCAO#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);

  /**
   * Returns the value of the '<em><b>ABRE PARENTESES</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ABRE PARENTESES</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ABRE PARENTESES</em>' attribute.
   * @see #setABRE_PARENTESES(String)
   * @see com.ufcg.compiler.go.GoPackage#getFUNCAO_ABRE_PARENTESES()
   * @model
   * @generated
   */
  String getABRE_PARENTESES();

  /**
   * Sets the value of the '{@link com.ufcg.compiler.go.FUNCAO#getABRE_PARENTESES <em>ABRE PARENTESES</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ABRE PARENTESES</em>' attribute.
   * @see #getABRE_PARENTESES()
   * @generated
   */
  void setABRE_PARENTESES(String value);

  /**
   * Returns the value of the '<em><b>PARAMETERS LIST</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PARAMETERS LIST</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PARAMETERS LIST</em>' containment reference.
   * @see #setPARAMETERS_LIST(PARAMETERS_LIST)
   * @see com.ufcg.compiler.go.GoPackage#getFUNCAO_PARAMETERS_LIST()
   * @model containment="true"
   * @generated
   */
  PARAMETERS_LIST getPARAMETERS_LIST();

  /**
   * Sets the value of the '{@link com.ufcg.compiler.go.FUNCAO#getPARAMETERS_LIST <em>PARAMETERS LIST</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PARAMETERS LIST</em>' containment reference.
   * @see #getPARAMETERS_LIST()
   * @generated
   */
  void setPARAMETERS_LIST(PARAMETERS_LIST value);

  /**
   * Returns the value of the '<em><b>FECHA PARENTESES</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>FECHA PARENTESES</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>FECHA PARENTESES</em>' attribute.
   * @see #setFECHA_PARENTESES(String)
   * @see com.ufcg.compiler.go.GoPackage#getFUNCAO_FECHA_PARENTESES()
   * @model
   * @generated
   */
  String getFECHA_PARENTESES();

  /**
   * Sets the value of the '{@link com.ufcg.compiler.go.FUNCAO#getFECHA_PARENTESES <em>FECHA PARENTESES</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>FECHA PARENTESES</em>' attribute.
   * @see #getFECHA_PARENTESES()
   * @generated
   */
  void setFECHA_PARENTESES(String value);

  /**
   * Returns the value of the '<em><b>Bloco</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bloco</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bloco</em>' containment reference.
   * @see #setBloco(BLOCK)
   * @see com.ufcg.compiler.go.GoPackage#getFUNCAO_Bloco()
   * @model containment="true"
   * @generated
   */
  BLOCK getBloco();

  /**
   * Sets the value of the '{@link com.ufcg.compiler.go.FUNCAO#getBloco <em>Bloco</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bloco</em>' containment reference.
   * @see #getBloco()
   * @generated
   */
  void setBloco(BLOCK value);

} // FUNCAO
