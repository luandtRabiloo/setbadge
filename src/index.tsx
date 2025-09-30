import { NativeModules } from 'react-native';

const { Setbadge } = NativeModules;

export const setBadge = (count: number) => Setbadge.setBadge(count);
export const clearBadge = () => Setbadge.clearBadge();
