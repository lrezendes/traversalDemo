# Tree Traversal Demo

This Java project demonstrates tree traversal algorithms: inorder, preorder, and postorder. It includes a `Node` class to represent nodes in a binary tree and a `TraversalDemo` class to perform traversal operations.

## Table of Contents

- [Getting Started](#getting-started)
- [Usage](#usage)
- [Explanation](#explanation)
- [Issues](#issues)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

To run this project, you need to have Java installed on your system. Clone this repository to your local machine using Git:

```
git clone https://github.com/your-username/tree-traversal-demo.git
```

Alternatively, you can download the ZIP file and extract it.

## Usage

Navigate to the project directory and compile the `TraversalDemo.java` file:

```
javac TraversalDemo.java
```

Then, run the compiled program:

```
java TraversalDemo
```

This will execute the `main` method in `TraversalDemo`, demonstrating the inorder, preorder, and postorder traversal algorithms on binary trees.

## Explanation

- The `Node` class represents nodes in a binary tree. Each node contains a number and references to its left and right child nodes.

- The `TraversalDemo` class contains the `main` method, which creates binary trees and performs traversal methods on them.

- Traversal methods (`inorder`, `preorder`, and `postorder`) recursively traverse the binary tree and print the numbers in the specified order.

## Issues

There are some issues in the traversal methods:
- In the `preorder` method, the left and right branches are swapped.
- In the `postorder` method, the left and right branches are swapped, and the root is printed before the children.

These issues should be corrected for the traversal methods to work correctly.

## Contributing

Contributions are welcome! If you find any issues or improvements, feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to adjust the content according to your preferences and project details.
