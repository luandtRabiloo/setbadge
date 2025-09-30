# react-native-setbadge

setbadge Anhdroid

## Installation

```sh
npm install react-native-setbadge


yarn add react-native-setbadge
```

## Usage

```js
import { NativeModules } from 'react-native';

const { Setbadge } = NativeModules;

export const setBadge = (count: number) => Setbadge.setBadge(count);
export const clearBadge = () => Setbadge.clearBadge();
```

## Contributing

- [Development workflow](CONTRIBUTING.md#development-workflow)
- [Sending a pull request](CONTRIBUTING.md#sending-a-pull-request)
- [Code of conduct](CODE_OF_CONDUCT.md)

## License

MIT

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)
