/**
 * Generated from platform:/resource/hu.bme.mit.md2g/src/main/java/hu/bme/mit/md2g/transformation/queries/StatechartQueries.vql
 */
package hu.bme.mit.md2g.transformation.queries;

import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Region;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern RegionsInStates(containingState: State, region: Region){
 *         	State.region(containingState, region);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class RegionsInStates extends BaseGeneratedEMFQuerySpecification<RegionsInStates.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.md2g.transformation.queries.RegionsInStates pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private State fContainingState;
    
    private Region fRegion;
    
    private static List<String> parameterNames = makeImmutableList("containingState", "region");
    
    private Match(final State pContainingState, final Region pRegion) {
      this.fContainingState = pContainingState;
      this.fRegion = pRegion;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("containingState".equals(parameterName)) return this.fContainingState;
      if ("region".equals(parameterName)) return this.fRegion;
      return null;
    }
    
    public State getContainingState() {
      return this.fContainingState;
    }
    
    public Region getRegion() {
      return this.fRegion;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("containingState".equals(parameterName) ) {
          this.fContainingState = (State) newValue;
          return true;
      }
      if ("region".equals(parameterName) ) {
          this.fRegion = (Region) newValue;
          return true;
      }
      return false;
    }
    
    public void setContainingState(final State pContainingState) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fContainingState = pContainingState;
    }
    
    public void setRegion(final Region pRegion) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRegion = pRegion;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.md2g.transformation.queries.RegionsInStates";
    }
    
    @Override
    public List<String> parameterNames() {
      return RegionsInStates.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fContainingState, fRegion};
    }
    
    @Override
    public RegionsInStates.Match toImmutable() {
      return isMutable() ? newMatch(fContainingState, fRegion) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"containingState\"=" + prettyPrintValue(fContainingState) + ", ");
      result.append("\"region\"=" + prettyPrintValue(fRegion));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fContainingState, fRegion);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof RegionsInStates.Match)) {
          RegionsInStates.Match other = (RegionsInStates.Match) obj;
          return Objects.equals(fContainingState, other.fContainingState) && Objects.equals(fRegion, other.fRegion);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }
    
    @Override
    public RegionsInStates specification() {
      return RegionsInStates.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static RegionsInStates.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pContainingState the fixed value of pattern parameter containingState, or null if not bound.
     * @param pRegion the fixed value of pattern parameter region, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static RegionsInStates.Match newMutableMatch(final State pContainingState, final Region pRegion) {
      return new Mutable(pContainingState, pRegion);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pContainingState the fixed value of pattern parameter containingState, or null if not bound.
     * @param pRegion the fixed value of pattern parameter region, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static RegionsInStates.Match newMatch(final State pContainingState, final Region pRegion) {
      return new Immutable(pContainingState, pRegion);
    }
    
    private static final class Mutable extends RegionsInStates.Match {
      Mutable(final State pContainingState, final Region pRegion) {
        super(pContainingState, pRegion);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends RegionsInStates.Match {
      Immutable(final State pContainingState, final Region pRegion) {
        super(pContainingState, pRegion);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.md2g.transformation.queries.RegionsInStates pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern RegionsInStates(containingState: State, region: Region){
   * 	State.region(containingState, region);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see RegionsInStates
   * 
   */
  public static class Matcher extends BaseMatcher<RegionsInStates.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static RegionsInStates.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static RegionsInStates.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_CONTAININGSTATE = 0;
    
    private static final int POSITION_REGION = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RegionsInStates.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pContainingState the fixed value of pattern parameter containingState, or null if not bound.
     * @param pRegion the fixed value of pattern parameter region, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<RegionsInStates.Match> getAllMatches(final State pContainingState, final Region pRegion) {
      return rawStreamAllMatches(new Object[]{pContainingState, pRegion}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pContainingState the fixed value of pattern parameter containingState, or null if not bound.
     * @param pRegion the fixed value of pattern parameter region, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<RegionsInStates.Match> streamAllMatches(final State pContainingState, final Region pRegion) {
      return rawStreamAllMatches(new Object[]{pContainingState, pRegion});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pContainingState the fixed value of pattern parameter containingState, or null if not bound.
     * @param pRegion the fixed value of pattern parameter region, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<RegionsInStates.Match> getOneArbitraryMatch(final State pContainingState, final Region pRegion) {
      return rawGetOneArbitraryMatch(new Object[]{pContainingState, pRegion});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pContainingState the fixed value of pattern parameter containingState, or null if not bound.
     * @param pRegion the fixed value of pattern parameter region, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final State pContainingState, final Region pRegion) {
      return rawHasMatch(new Object[]{pContainingState, pRegion});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pContainingState the fixed value of pattern parameter containingState, or null if not bound.
     * @param pRegion the fixed value of pattern parameter region, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final State pContainingState, final Region pRegion) {
      return rawCountMatches(new Object[]{pContainingState, pRegion});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pContainingState the fixed value of pattern parameter containingState, or null if not bound.
     * @param pRegion the fixed value of pattern parameter region, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final State pContainingState, final Region pRegion, final Consumer<? super RegionsInStates.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pContainingState, pRegion}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pContainingState the fixed value of pattern parameter containingState, or null if not bound.
     * @param pRegion the fixed value of pattern parameter region, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public RegionsInStates.Match newMatch(final State pContainingState, final Region pRegion) {
      return RegionsInStates.Match.newMatch(pContainingState, pRegion);
    }
    
    /**
     * Retrieve the set of values that occur in matches for containingState.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<State> rawStreamAllValuesOfcontainingState(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CONTAININGSTATE, parameters).map(State.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for containingState.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfcontainingState() {
      return rawStreamAllValuesOfcontainingState(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for containingState.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<State> streamAllValuesOfcontainingState() {
      return rawStreamAllValuesOfcontainingState(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for containingState.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<State> streamAllValuesOfcontainingState(final RegionsInStates.Match partialMatch) {
      return rawStreamAllValuesOfcontainingState(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for containingState.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<State> streamAllValuesOfcontainingState(final Region pRegion) {
      return rawStreamAllValuesOfcontainingState(new Object[]{null, pRegion});
    }
    
    /**
     * Retrieve the set of values that occur in matches for containingState.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfcontainingState(final RegionsInStates.Match partialMatch) {
      return rawStreamAllValuesOfcontainingState(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for containingState.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfcontainingState(final Region pRegion) {
      return rawStreamAllValuesOfcontainingState(new Object[]{null, pRegion}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for region.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Region> rawStreamAllValuesOfregion(final Object[] parameters) {
      return rawStreamAllValues(POSITION_REGION, parameters).map(Region.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for region.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Region> getAllValuesOfregion() {
      return rawStreamAllValuesOfregion(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for region.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Region> streamAllValuesOfregion() {
      return rawStreamAllValuesOfregion(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for region.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Region> streamAllValuesOfregion(final RegionsInStates.Match partialMatch) {
      return rawStreamAllValuesOfregion(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for region.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Region> streamAllValuesOfregion(final State pContainingState) {
      return rawStreamAllValuesOfregion(new Object[]{pContainingState, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for region.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Region> getAllValuesOfregion(final RegionsInStates.Match partialMatch) {
      return rawStreamAllValuesOfregion(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for region.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Region> getAllValuesOfregion(final State pContainingState) {
      return rawStreamAllValuesOfregion(new Object[]{pContainingState, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected RegionsInStates.Match tupleToMatch(final Tuple t) {
      try {
          return RegionsInStates.Match.newMatch((State) t.get(POSITION_CONTAININGSTATE), (Region) t.get(POSITION_REGION));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RegionsInStates.Match arrayToMatch(final Object[] match) {
      try {
          return RegionsInStates.Match.newMatch((State) match[POSITION_CONTAININGSTATE], (Region) match[POSITION_REGION]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RegionsInStates.Match arrayToMatchMutable(final Object[] match) {
      try {
          return RegionsInStates.Match.newMutableMatch((State) match[POSITION_CONTAININGSTATE], (Region) match[POSITION_REGION]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<RegionsInStates.Matcher> querySpecification() {
      return RegionsInStates.instance();
    }
  }
  
  private RegionsInStates() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static RegionsInStates instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected RegionsInStates.Matcher instantiate(final ViatraQueryEngine engine) {
    return RegionsInStates.Matcher.on(engine);
  }
  
  @Override
  public RegionsInStates.Matcher instantiate() {
    return RegionsInStates.Matcher.create();
  }
  
  @Override
  public RegionsInStates.Match newEmptyMatch() {
    return RegionsInStates.Match.newEmptyMatch();
  }
  
  @Override
  public RegionsInStates.Match newMatch(final Object... parameters) {
    return RegionsInStates.Match.newMatch((com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State) parameters[0], (com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Region) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.md2g.transformation.queries.RegionsInStates (visibility: PUBLIC, simpleName: RegionsInStates, identifier: hu.bme.mit.md2g.transformation.queries.RegionsInStates, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.md2g.transformation.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.md2g.transformation.queries.RegionsInStates (visibility: PUBLIC, simpleName: RegionsInStates, identifier: hu.bme.mit.md2g.transformation.queries.RegionsInStates, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.md2g.transformation.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final RegionsInStates INSTANCE = new RegionsInStates();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final RegionsInStates.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_containingState = new PParameter("containingState", "com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "State")), PParameterDirection.INOUT);
    
    private final PParameter parameter_region = new PParameter("region", "com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Region", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Region")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_containingState, parameter_region);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.md2g.transformation.queries.RegionsInStates";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("containingState","region");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_containingState = body.getOrCreateVariableByName("containingState");
          PVariable var_region = body.getOrCreateVariableByName("region");
          new TypeConstraint(body, Tuples.flatTupleOf(var_containingState), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "State")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_region), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Region")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_containingState, parameter_containingState),
             new ExportedParameter(body, var_region, parameter_region)
          ));
          // 	State.region(containingState, region)
          new TypeConstraint(body, Tuples.flatTupleOf(var_containingState), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "State")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_containingState, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "State", "region")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Region")));
          new Equality(body, var__virtual_0_, var_region);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
