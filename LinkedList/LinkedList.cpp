//
//  LinkedList.cpp
//

#include "LinkedList.h"
#include "Flags.h"

/* **************************************************************** */

#if CONSTRUCTOR || ALL
// Constructor
//template <class T>
//LinkedList<T>::LinkedList()
//{
    // TODO: Allocate dummy node

//}
#endif

/* **************************************************************** */

#if DESTRUCTOR || ALL
// Destructor
//template <class T>
//LinkedList<T>::~LinkedList()
//{
    // TODO: Remove any nodes
    
    // TODO: Free dummy node

//}
#endif

/* **************************************************************** */

#if ALL || GETFIRST
// TODO: getFirst
#endif

/* **************************************************************** */

#if ALL || GETLAST
// TODO: getLast
#endif

/* **************************************************************** */

#if ALL || FIND
// TODO: find
#endif

/* **************************************************************** */

#if ALL || FINDNODE
// TODO: findNode
#endif

/* **************************************************************** */

#if ALL || INSERT
// TODO: insert
#endif

/* **************************************************************** */

#if ALL || REMOVE
// TODO: remove
#endif

/* **************************************************************** */

#if ALL || ISEMPTY
// TODO: isEmpty
#endif

/* **************************************************************** */

#if ALL || MAKEEMPTY
// TODO: makeEmpty
#endif

/* **************************************************************** */

#if ALL || COPY_CONSTRUCTOR
// TODO: Copy constructor
#endif

/* **************************************************************** */

#if ALL || ASSIGN
// TODO: Assignment operator
#endif

/* **************************************************************** */
// Do NOT modify anything below this line
/* **************************************************************** */

#ifndef BUILD_LIB
// Print list
template <class T>
void LinkedList<T>::printList()
{
    if(isEmpty())
    {
        // Empty list
        std::cout << "Empty List" << std::endl;
    } else {
        // Iterate to end
        Node<T> *p = dummy->next;
        
        // Loop to end
        while (p != dummy)
        {
            std::cout << p->data << " ";
            p = p->next;
        }
        std::cout << std::endl;
    }
}
#endif

template class LinkedList<int>;
