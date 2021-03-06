/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.util;

import com.ufcg.compiladores.go.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.ufcg.compiladores.go.GoPackage
 * @generated
 */
public class GoAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GoPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GoPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GoSwitch<Adapter> modelSwitch =
    new GoSwitch<Adapter>()
    {
      @Override
      public Adapter caseInit(Init object)
      {
        return createInitAdapter();
      }
      @Override
      public Adapter caseBOOLEAN_VALUE(BOOLEAN_VALUE object)
      {
        return createBOOLEAN_VALUEAdapter();
      }
      @Override
      public Adapter caseGoDecl(GoDecl object)
      {
        return createGoDeclAdapter();
      }
      @Override
      public Adapter caseForDecl(ForDecl object)
      {
        return createForDeclAdapter();
      }
      @Override
      public Adapter caseRangeDecl(RangeDecl object)
      {
        return createRangeDeclAdapter();
      }
      @Override
      public Adapter caseForClause(ForClause object)
      {
        return createForClauseAdapter();
      }
      @Override
      public Adapter caseInitStmt(InitStmt object)
      {
        return createInitStmtAdapter();
      }
      @Override
      public Adapter casePostStmt(PostStmt object)
      {
        return createPostStmtAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseIDList(IDList object)
      {
        return createIDListAdapter();
      }
      @Override
      public Adapter caseVarDecl(VarDecl object)
      {
        return createVarDeclAdapter();
      }
      @Override
      public Adapter caseSignatureDel(SignatureDel object)
      {
        return createSignatureDelAdapter();
      }
      @Override
      public Adapter caseAssignment(Assignment object)
      {
        return createAssignmentAdapter();
      }
      @Override
      public Adapter caseTIPO(TIPO object)
      {
        return createTIPOAdapter();
      }
      @Override
      public Adapter caseVar(Var object)
      {
        return createVarAdapter();
      }
      @Override
      public Adapter caseConst(Const object)
      {
        return createConstAdapter();
      }
      @Override
      public Adapter caseIGUAL(IGUAL object)
      {
        return createIGUALAdapter();
      }
      @Override
      public Adapter casePONTOSIGUAL(PONTOSIGUAL object)
      {
        return createPONTOSIGUALAdapter();
      }
      @Override
      public Adapter caseEXPRESSAOLINHA(EXPRESSAOLINHA object)
      {
        return createEXPRESSAOLINHAAdapter();
      }
      @Override
      public Adapter caseEXPRESSAO(EXPRESSAO object)
      {
        return createEXPRESSAOAdapter();
      }
      @Override
      public Adapter caseReturnStmt(ReturnStmt object)
      {
        return createReturnStmtAdapter();
      }
      @Override
      public Adapter caseArrayValue(ArrayValue object)
      {
        return createArrayValueAdapter();
      }
      @Override
      public Adapter caseLiteraisList(LiteraisList object)
      {
        return createLiteraisListAdapter();
      }
      @Override
      public Adapter caseLITERAIS_BASICOS(LITERAIS_BASICOS object)
      {
        return createLITERAIS_BASICOSAdapter();
      }
      @Override
      public Adapter caseBINARY_EXP(BINARY_EXP object)
      {
        return createBINARY_EXPAdapter();
      }
      @Override
      public Adapter caseFunctionType(FunctionType object)
      {
        return createFunctionTypeAdapter();
      }
      @Override
      public Adapter caseSignature(Signature object)
      {
        return createSignatureAdapter();
      }
      @Override
      public Adapter caseParameters(Parameters object)
      {
        return createParametersAdapter();
      }
      @Override
      public Adapter caseIfCondition(IfCondition object)
      {
        return createIfConditionAdapter();
      }
      @Override
      public Adapter caseElseIfCondition(ElseIfCondition object)
      {
        return createElseIfConditionAdapter();
      }
      @Override
      public Adapter caseElseCondition(ElseCondition object)
      {
        return createElseConditionAdapter();
      }
      @Override
      public Adapter caseBLOCK(BLOCK object)
      {
        return createBLOCKAdapter();
      }
      @Override
      public Adapter casePARAMETERS_LIST(PARAMETERS_LIST object)
      {
        return createPARAMETERS_LISTAdapter();
      }
      @Override
      public Adapter casePARAMETER(PARAMETER object)
      {
        return createPARAMETERAdapter();
      }
      @Override
      public Adapter caseTypes(Types object)
      {
        return createTypesAdapter();
      }
      @Override
      public Adapter caseArrayType(ArrayType object)
      {
        return createArrayTypeAdapter();
      }
      @Override
      public Adapter caseBasicType(BasicType object)
      {
        return createBasicTypeAdapter();
      }
      @Override
      public Adapter caseVarCall(VarCall object)
      {
        return createVarCallAdapter();
      }
      @Override
      public Adapter caseFunctionCall(FunctionCall object)
      {
        return createFunctionCallAdapter();
      }
      @Override
      public Adapter caseChamada(Chamada object)
      {
        return createChamadaAdapter();
      }
      @Override
      public Adapter caseBOOL_OP(BOOL_OP object)
      {
        return createBOOL_OPAdapter();
      }
      @Override
      public Adapter caseARIT_EXPR(ARIT_EXPR object)
      {
        return createARIT_EXPRAdapter();
      }
      @Override
      public Adapter caseIfStmt(IfStmt object)
      {
        return createIfStmtAdapter();
      }
      @Override
      public Adapter caseCOMPARISON(COMPARISON object)
      {
        return createCOMPARISONAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.Init <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.Init
   * @generated
   */
  public Adapter createInitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.BOOLEAN_VALUE <em>BOOLEAN VALUE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.BOOLEAN_VALUE
   * @generated
   */
  public Adapter createBOOLEAN_VALUEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.GoDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.GoDecl
   * @generated
   */
  public Adapter createGoDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.ForDecl <em>For Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.ForDecl
   * @generated
   */
  public Adapter createForDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.RangeDecl <em>Range Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.RangeDecl
   * @generated
   */
  public Adapter createRangeDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.ForClause <em>For Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.ForClause
   * @generated
   */
  public Adapter createForClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.InitStmt <em>Init Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.InitStmt
   * @generated
   */
  public Adapter createInitStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.PostStmt <em>Post Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.PostStmt
   * @generated
   */
  public Adapter createPostStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.IDList <em>ID List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.IDList
   * @generated
   */
  public Adapter createIDListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.VarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.VarDecl
   * @generated
   */
  public Adapter createVarDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.SignatureDel <em>Signature Del</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.SignatureDel
   * @generated
   */
  public Adapter createSignatureDelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.Assignment
   * @generated
   */
  public Adapter createAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.TIPO <em>TIPO</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.TIPO
   * @generated
   */
  public Adapter createTIPOAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.Var
   * @generated
   */
  public Adapter createVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.Const <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.Const
   * @generated
   */
  public Adapter createConstAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.IGUAL <em>IGUAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.IGUAL
   * @generated
   */
  public Adapter createIGUALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.PONTOSIGUAL <em>PONTOSIGUAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.PONTOSIGUAL
   * @generated
   */
  public Adapter createPONTOSIGUALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.EXPRESSAOLINHA <em>EXPRESSAOLINHA</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.EXPRESSAOLINHA
   * @generated
   */
  public Adapter createEXPRESSAOLINHAAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.EXPRESSAO <em>EXPRESSAO</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.EXPRESSAO
   * @generated
   */
  public Adapter createEXPRESSAOAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.ReturnStmt <em>Return Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.ReturnStmt
   * @generated
   */
  public Adapter createReturnStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.ArrayValue <em>Array Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.ArrayValue
   * @generated
   */
  public Adapter createArrayValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.LiteraisList <em>Literais List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.LiteraisList
   * @generated
   */
  public Adapter createLiteraisListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.LITERAIS_BASICOS <em>LITERAIS BASICOS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.LITERAIS_BASICOS
   * @generated
   */
  public Adapter createLITERAIS_BASICOSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.BINARY_EXP <em>BINARY EXP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.BINARY_EXP
   * @generated
   */
  public Adapter createBINARY_EXPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.FunctionType <em>Function Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.FunctionType
   * @generated
   */
  public Adapter createFunctionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.Signature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.Signature
   * @generated
   */
  public Adapter createSignatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.Parameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.Parameters
   * @generated
   */
  public Adapter createParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.IfCondition <em>If Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.IfCondition
   * @generated
   */
  public Adapter createIfConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.ElseIfCondition <em>Else If Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.ElseIfCondition
   * @generated
   */
  public Adapter createElseIfConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.ElseCondition <em>Else Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.ElseCondition
   * @generated
   */
  public Adapter createElseConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.BLOCK <em>BLOCK</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.BLOCK
   * @generated
   */
  public Adapter createBLOCKAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.PARAMETERS_LIST <em>PARAMETERS LIST</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.PARAMETERS_LIST
   * @generated
   */
  public Adapter createPARAMETERS_LISTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.PARAMETER <em>PARAMETER</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.PARAMETER
   * @generated
   */
  public Adapter createPARAMETERAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.Types <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.Types
   * @generated
   */
  public Adapter createTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.ArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.ArrayType
   * @generated
   */
  public Adapter createArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.BasicType
   * @generated
   */
  public Adapter createBasicTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.VarCall <em>Var Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.VarCall
   * @generated
   */
  public Adapter createVarCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.FunctionCall
   * @generated
   */
  public Adapter createFunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.Chamada <em>Chamada</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.Chamada
   * @generated
   */
  public Adapter createChamadaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.BOOL_OP <em>BOOL OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.BOOL_OP
   * @generated
   */
  public Adapter createBOOL_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.ARIT_EXPR <em>ARIT EXPR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.ARIT_EXPR
   * @generated
   */
  public Adapter createARIT_EXPRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.IfStmt <em>If Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.IfStmt
   * @generated
   */
  public Adapter createIfStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ufcg.compiladores.go.COMPARISON <em>COMPARISON</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ufcg.compiladores.go.COMPARISON
   * @generated
   */
  public Adapter createCOMPARISONAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GoAdapterFactory
