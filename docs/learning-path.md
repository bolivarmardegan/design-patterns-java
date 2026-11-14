# Learning path

1. Read the intent and problem in `README.md`.
2. Run `CheckoutDemo` and inspect the accepted/rejected decisions.
3. Put breakpoints in each `handle` method and follow the call chain.
4. Change the chain order in `CheckoutChain` and reason about the result.
5. Add a new handler (e.g., `FraudCheckHandler`) and test its short-circuit behavior.
6. Study how this differs from Decorator and Strategy.

## Future patterns

Add future examples in sibling packages:
`behavioral/strategy`, `behavioral/observer`, `creational/factorymethod`,
`structural/adapter`, etc. Keep each pattern independent with a dedicated demo and tests.
