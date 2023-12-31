# search.py
# ---------
# Licensing Information: Please do not distribute or publish solutions to this
# project. You are free to use and extend these projects for educational
# purposes. The Pacman AI projects were developed at UC Berkeley, primarily by
# John DeNero (denero@cs.berkeley.edu) and Dan Klein (klein@cs.berkeley.edu).
# For more info, see http://inst.eecs.berkeley.edu/~cs188/sp09/pacman.html

"""
In search.py, you will implement generic search algorithms which are called
by Pacman agents (in searchAgents.py).
"""

import util
from util import heappush, heappop


class SearchProblem:
    """
    This class outlines the structure of a search problem, but doesn't implement
    any of the methods (in object-oriented terminology: an abstract class).

    You do not need to change anything in this class, ever.
    """

    def getStartState(self):
        """
        Returns the start state for the search problem
        """
        util.raiseNotDefined()

    def isGoalState(self, state):
        """
        state: Search state

        Returns True if and only if the state is a valid goal state
        """
        util.raiseNotDefined()

    def getSuccessors(self, state):
        """
        state: Search state

        For a given state, this should return a list of triples,
        (successor, action, stepCost), where 'successor' is a
        successor to the current state, 'action' is the action
        required to get there, and 'stepCost' is the incremental
        cost of expanding to that successor
        """
        util.raiseNotDefined()

    def getCostOfActions(self, actions):
        """
        actions: A list of actions to take

        This method returns the total cost of a particular sequence of actions.  The sequence must
        be composed of legal moves
        """
        util.raiseNotDefined()


def tinyMazeSearch(problem):
    """
    Returns a sequence of moves that solves tinyMaze.  For any other
    maze, the sequence of moves will be incorrect, so only use this for tinyMaze
    """
    from game import Directions

    s = Directions.SOUTH
    w = Directions.WEST
    return [s, s, w, s, w, w, s, w]


def depthFirstSearch(problem):
    """
    Search the deepest nodes in the search tree first.
    Your search algorithm needs to return a list of actions that reaches
    the goal. Make sure that you implement the graph search version of DFS,
    which avoids expanding any already visited states.
    Otherwise your implementation may run infinitely!
    To get started, you might want to try some of these simple commands to
    understand the search problem that is being passed in:
    print("Start:", problem.getStartState())
    print("Is the start a goal?", problem.isGoalState(problem.getStartState()))
    print("Start's successors:", problem.getSuccessors(problem.getStartState()))
    """
    """
    YOUR CODE HERE
    """

    """ node is a tuple of (state, action_path, path_cost), used like a stack in dfs """
    states = [(problem.getStartState(), [], 0)]
    """ visited holds a list of states that have been visited """
    visited = []
    """ temporary list storing last action path """
    action_path: list()

    """ If goal state is start state, return []! """

    if not problem.isGoalState(problem.getStartState()):
        """otherwise loop until goal state or no states left to expand"""

        while len(states) > 0:
            """select the state at the end of the stack"""

            selected_state = states.pop()

            """ unpack our start state tuple """

            expanded_state, action_path, path_cost = selected_state

            """ edge case handler if state visited but not before another node queued it again """

            if expanded_state in visited:
                continue

            """ still here? append to visited list """

            visited.append(expanded_state)

            """ if goal state found, return path """

            if problem.isGoalState(expanded_state):
                return action_path

            """ otherwise get successors of popped state and add to stack """

            successors = problem.getSuccessors(expanded_state)

            """ add unvisited successors to stack in form of 3-tuple """

            for item in successors:
                if item[0] not in visited:
                    states.append((item[0], action_path + [item[1]], 0))

        """ if no solution found, raise exception """

        if len(states) == 0:
            raise Exception("No solution found")

    """ default return, either start is goal or no states to expand """

    return []


def breadthFirstSearch(problem):
    """
    YOUR CODE HERE
    """

    """ node is a tuple of (state, action_path, path_cost), used like a queue in bfs """

    states = [(problem.getStartState(), [], 0)]

    """ visited holds a list of states that have been visited """

    visited = []

    """ temporary list storing last action path """

    action_path: list()

    """ If goal state is start state, return []! """

    if not problem.isGoalState(problem.getStartState()):
        """otherwise loop until goal state or no states left to expand"""

        while len(states) > 0:
            """select the state at the beginning of the queue"""

            selected_state = states[0]

            """ unpack our start state tuple """

            expanded_state, action_path, path_cost = selected_state
            states.remove(states[0])

            """ if state already visited, continue """

            if expanded_state in visited:
                continue

            """ add state to visited list """

            visited.append(expanded_state)

            """ if goal state found, return path """

            if problem.isGoalState(expanded_state):
                return action_path

            """ otherwise get successors of state and add to queue """

            successors = problem.getSuccessors(expanded_state)

            """ add unvisited successors to queue in form of 3-tuple"""

            for item in successors:
                if item[0] not in visited:
                    states.append((item[0], action_path + [item[1]], 0))

            """ if no solution found, raise exception """

        if len(states) == 0:
            raise Exception("No solution found")

    """ default return, either start is goal or no states to expand """

    return []


def uniformCostSearch(problem):
    """
    YOUR CODE HERE
    """

    """ states holds a tuple of (state, action_path, path_cost) """

    states = [(problem.getStartState(), [], 0)]

    """ visited holds a list of states that have been visited """

    visited = []

    """ action_path holds the last saved path """

    action_path: list()

    """ if goal state is start state, return nothing """

    if not problem.isGoalState(problem.getStartState()):
        """while there are still states to expand"""

        while len(states) > 0:
            """unpack top 3-tuple from top of stack"""
            """ passes a lambda function that returns the backwards path cost given a tuple to min() """
            min_state = min(states, key=lambda t: t[2])
            expanded_state, action_path, path_cost = min_state
            states.remove(min_state)

            """ continue if state in queue visited """

            if expanded_state in visited:
                continue

            """ add popped state to visited list """

            visited.append(expanded_state)

            """ if goal state found, return path """

            if problem.isGoalState(expanded_state):
                return action_path

            """ otherwise get successors of popped state and add to queue """

            successors = problem.getSuccessors(expanded_state)

            """ add unvisited successors to queue in form of 3-tuple"""

            for item in successors:
                if item[0] not in visited:
                    states.append(
                        (item[0], action_path + [item[1]], path_cost + item[2])
                    )

        """ if no solution found, raise exception """

        if len(states) == 0:
            raise Exception("No solution found")

    """ default return, either start is goal or no states to expand """

    return []


def nullHeuristic(state, problem=None):
    """
    A heuristic function estimates the cost from the current state to the nearest
    goal in the provided SearchProblem.  This heuristic is trivial.
    """
    return 0


def aStarSearch(problem, heuristic=nullHeuristic):
    """
    YOUR CODE HERE
    """

    """ states holds a tuple of (state, action_path, path_cost) """

    states = [(problem.getStartState(), [], 0)]

    """ visited holds a list of states that have been visited """

    visited = []

    """ action_path holds the last saved path """

    action_path: list()

    """ if goal state is start state, return nothing """

    if not problem.isGoalState(problem.getStartState()):
        """while there are still states to expand"""

        while len(states) > 0:
            """unpack top 3-tuple from heuristic+cost"""
            """ passes a lambda function that returns the sum of the path cost and heuristic given a tuple to min()"""

            min_state = min(states, key=lambda t: t[2] + heuristic(t[0], problem))
            expanded_state, action_path, path_cost = min_state
            states.remove(min_state)

            """ continue if state in queue visited """

            if expanded_state in visited:
                continue

            """ add popped state to visited list """

            visited.append(expanded_state)

            """ if goal state found, return path """

            if problem.isGoalState(expanded_state):
                return action_path

            """ otherwise get successors of popped state and add to list """

            successors = problem.getSuccessors(expanded_state)

            """ add unvisited successors to list in form of 3-tuple"""

            for item in successors:
                if item[0] not in visited:
                    states.append(
                        (item[0], action_path + [item[1]], path_cost + item[2])
                    )

        """ if no solution found, raise exception """

        if len(states) == 0:
            raise Exception("No solution found")

    """ default return, either start is goal or no states to expand """

    return []


# Abbreviations
bfs = breadthFirstSearch
dfs = depthFirstSearch
astar = aStarSearch
ucs = uniformCostSearch
