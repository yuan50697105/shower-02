import defaultSettings from '@/settings'

const title = defaultSettings.title || '智能淋浴系统'

export default function getPageTitle(pageTitle) {
  if (pageTitle) {
    return `${pageTitle} - ${title}`
  }
  return `${title}`
}
