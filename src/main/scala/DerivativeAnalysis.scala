// Provides a derivative-based static analysis of regular expressions that
// yields a DFA describing the language recognized by an expression.

package edu.ucsb.cs.cs162.regex.derivative

import edu.ucsb.cs.cs162.dfa._
import edu.ucsb.cs.cs162.range_set._
import edu.ucsb.cs.cs162.regex._

object DerivativeAnalysis {
  import Derive._
  import Regex._

  //----------------------------------------------------------------------------
  // Public API.
  //----------------------------------------------------------------------------

  // Statically analyzes 're' using derivatives in order to compute the DFA of
  // the language recognized by 're'. The resulting DFA has an explicit error
  // state and is approximately minimal.
  def analyze(re: Regex): Dfa[Regex] = ???

  // Return the set of all possible derivatives of 're'
  // not including 're' unless it is a derivative of itself
  def derivativeClosure(re: Regex): Set[Regex] =
    computeDfa(todo = Set(), visitedStates = Set(), transitions = Map())._1

  //----------------------------------------------------------------------------
  // Private details.
  //----------------------------------------------------------------------------

  // Compute the transitions and set of reachable states (i.e., Regexes) for all
  // Regexes in 'todo'.
  // @annotation.tailrec
  private def computeDfa(todo: Set[Regex], visitedStates: Set[Regex],
    transitions: Transitions[Regex]) : (Set[Regex], Transitions[Regex]) = ???

  // Compute the transitions and destination states from the given regex.
  private def computeNext(state: Regex): (Set[Regex], Transitions[Regex]) = ???
}
