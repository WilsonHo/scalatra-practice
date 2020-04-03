package bao.ho.app

import com.google.common.io.BaseEncoding
import org.apache.commons.codec.Charsets

object EncodeDecodeExample {

  def decode(str: String): String = {
    val bytes = java.util.Base64.getDecoder.decode(str)
    new String(bytes)
  }

  def encode(str: String): String =
    BaseEncoding.base64().encode(str.getBytes(Charsets.UTF_8))

  def main(args: Array[String]): Unit = {
    val encodedString =
      "eyJqb2JfaW5mbyI6eyJ0eXBlIjoiRXhjZXB0aW9uIiwic3VidHlwZSI6ImV4Y2VwdGlvbiIsInRlbXBvcmFsX2RlcGVuZGVuY3kiOnsiaW5wdXRzIjpbXSwib3V0cHV0Ijp7InByZXZfYXBwX2lkIjoiYXBwbGljYXRpb25fOCJ9fSwibWFpbl9kaXIiOiIvZXRsX291dHB1dC8iLCJpbnB1dF9maWxlcyI6WyJHbG9iYWxfQ29icmEiLCJPSSIsIkdNSV9WU19FVUNMSURfR1BNIiwiU01PX1ZTX0VVQ0xJRF9TUEVBUiIsIlNNT19kMjYzMzAwMSIsIkdNSSIsIkV1Y2xpZF9UcmFkZSIsIkZJTjEyMTQiLCJMYXRlX1RyYWRlIiwiUGVuZGluZ19UcmFkZSIsImxvYW5pcV9mcmUiLCJEQ0MiLCJFdWNsaWRfUHJvZHVjdENvbnRyb2wiLCJFdWNsaWRfVERjYXNoZmxvdyIsIkV1Y2xpZCJdLCJkcml2ZXJfY2xhc3MiOiJjb20ubm9tdXJhLnJzLkdsb2JhbENvYnJhLkVxdWl0eS5Ecml2ZXIiLCJuYW1lIjoiR2xvYmFsX0VxdWl0eV9BRUoifSwiY29uZmlnX2ZpbGVzIjp7ImphciI6Ijc4Y2Q0ZjBkLWYzNjMtNDcyYS1hMmZmLTkzNjJjZjcxMzU1YiIsImNvbmYiOiI0NjlkYjk2YS0xMTkxLTQ2NTgtOTJhOC00OGVmYmM3YWY4NmEifSwiaW5wdXRzIjp7IlBlbmRpbmdfVHJhZGUiOiJQZW5kaW5nX1RyYWRlLmNzdiIsIkdNSSI6IkdNSS5jc3YiLCJFdWNsaWRfVHJhZGUiOiJFdWNsaWRfVHJhZGUuY3N2IiwiTGF0ZV9UcmFkZSI6IkxhdGVfVHJhZGUuY3N2IiwiRXVjbGlkX1REY2FzaGZsb3ciOiJFdWNsaWRfVERjYXNoZmxvdy5jc3YiLCJEQ0MiOiJEQ0MuY3N2IiwiU01PX2QyNjMzMDAxIjoiU01PX2QyNjMzMDAxLmNzdiIsIkdsb2JhbF9Db2JyYSI6Ikdsb2JhbF9Db2JyYS5jc3YiLCJGSU4xMjE0IjoiRklOMTIxNC5jc3YiLCJFdWNsaWQiOiJFdWNsaWQuY3N2IiwibG9hbmlxX2ZyZSI6ImxvYW5pcV9mcmUuY3N2IiwiR01JX1ZTX0VVQ0xJRF9HUE0iOiJHTUlfVlNfRVVDTElEX0dQTS5jc3YiLCJFdWNsaWRfUHJvZHVjdENvbnRyb2wiOiJFdWNsaWRfUHJvZHVjdENvbnRyb2wuY3N2IiwiT0kiOiJPSS5jc3YiLCJTTU9fVlNfRVVDTElEX1NQRUFSIjoiU01PX1ZTX0VVQ0xJRF9TUEVBUi5jc3YifSwib3V0cHV0cyI6eyJkaXJlY3RvcnkiOiIvb3V0cHV0cyIsImZpbGVzIjp7ImFkanVzdG1lbnRfdGVtcGxhdGVfcG9zaXRpb25fYnJlYWsiOnsibmFtZSI6ImFkanVzdG1lbnRfdGVtcGxhdGVfcG9zaXRpb25fYnJlYWsuY3N2IiwiY29sdW1ucyI6WyJDT0JfRGF0ZV9UVCIsIkNvYnJhIEFkaiBDYXRlZ29yeSIsIkNvYnJhIEFkaiBUeXBlIiwiRXZlbnRDb2RlIiwiRXZlbnREZXNjcmlwdGlvbiIsIlBvc3RpbmdGbGFnIiwiVmFsdWVEYXRlIiwiQm9vayIsIk5vbWluYWwiLCJJbnN0cnVtZW50UmRtSWQiLCJDb3VudGVycGFydHlSZG1JZCIsIk5vc3Ryb1JkbUlkIiwiSW1wZXJzb25hbCIsIkN1cnJlbmN5IiwiVHJhZGVSZWYiLCJBbW91bnQiLCJOYXJyYXRpdmUiLCJSZXZlcnNlRmxhZyIsIlJldmVyc2VEYXRlIiwiQWx0UG9zdGluZ0ZsYWciLCJBbHRCb29rIl19LCJhZGp1c3RtZW50X3RlbXBsYXRlX3RyYWRlX3ByaWNlX2JyZWFrIjp7Im5hbWUiOiJhZGp1c3RtZW50X3RlbXBsYXRlX3RyYWRlX3ByaWNlX2JyZWFrLmNzdiIsImNvbHVtbnMiOlsiQ09CX0RhdGVfVFQiLCJDb2JyYSBBZGogQ2F0ZWdvcnkiLCJDb2JyYSBBZGogVHlwZSIsIkV2ZW50Q29kZSIsIkV2ZW50RGVzY3JpcHRpb24iLCJQb3N0aW5nRmxhZyIsIlZhbHVlRGF0ZSIsIkJvb2siLCJOb21pbmFsIiwiSW5zdHJ1bWVudFJkbUlkIiwiQ291bnRlcnBhcnR5UmRtSWQiLCJOb3N0cm9SZG1JZCIsIkltcGVyc29uYWwiLCJDdXJyZW5jeSIsIlRyYWRlUmVmIiwiQW1vdW50IiwiTmFycmF0aXZlIiwiUmV2ZXJzZUZsYWciLCJSZXZlcnNlRGF0ZSIsIkFsdFBvc3RpbmdGbGFnIiwiQWx0Qm9vayJdfSwiYWRqdXN0bWVudF90ZW1wbGF0ZV9yZXByaWNlX3JkbV91cGRvd24iOnsibmFtZSI6ImFkanVzdG1lbnRfdGVtcGxhdGVfcmVwcmljZV9yZG1fdXBkb3duLmNzdiIsImNvbHVtbnMiOlsiQ09CX0RhdGVfVFQiLCJDb2JyYSBBZGogQ2F0ZWdvcnkiLCJDb2JyYSBBZGogVHlwZSIsIkV2ZW50Q29kZSIsIkV2ZW50RGVzY3JpcHRpb24iLCJQb3N0aW5nRmxhZyIsIlZhbHVlRGF0ZSIsIkJvb2siLCJOb21pbmFsIiwiSW5zdHJ1bWVudFJkbUlkIiwiQ291bnRlcnBhcnR5UmRtSWQiLCJOb3N0cm9SZG1JZCIsIkltcGVyc29uYWwiLCJDdXJyZW5jeSIsIlRyYWRlUmVmIiwiQW1vdW50IiwiTmFycmF0aXZlIiwiUmV2ZXJzZUZsYWciLCJSZXZlcnNlRGF0ZSIsIkFsdFBvc3RpbmdGbGFnIiwiQWx0Qm9vayJdfSwiYWRqdXN0bWVudF90ZW1wbGF0ZV9uZmlrX2Nhc2hfZmFpbHMiOnsibmFtZSI6ImFkanVzdG1lbnRfdGVtcGxhdGVfbmZpa19jYXNoX2ZhaWxzLmNzdiIsImNvbHVtbnMiOlsiQ09CX0RhdGVfVFQiLCJDb2JyYSBBZGogQ2F0ZWdvcnkiLCJDb2JyYSBBZGogVHlwZSIsIkV2ZW50Q29kZSIsIkV2ZW50RGVzY3JpcHRpb24iLCJQb3N0aW5nRmxhZyIsIlZhbHVlRGF0ZSIsIkJvb2siLCJOb21pbmFsIiwiSW5zdHJ1bWVudFJkbUlkIiwiQ291bnRlcnBhcnR5UmRtSWQiLCJOb3N0cm9SZG1JZCIsIkltcGVyc29uYWwiLCJDdXJyZW5jeSIsIlRyYWRlUmVmIiwiQW1vdW50IiwiTmFycmF0aXZlIiwiUmV2ZXJzZUZsYWciLCJSZXZlcnNlRGF0ZSIsIkFsdFBvc3RpbmdGbGFnIiwiQWx0Qm9vayJdfSwiYWRqdXN0bWVudF90ZW1wbGF0ZV9zeXN0ZW1fZmVlZF9lcnJvciI6eyJuYW1lIjoiYWRqdXN0bWVudF90ZW1wbGF0ZV9zeXN0ZW1fZmVlZF9lcnJvci5jc3YiLCJjb2x1bW5zIjpbIkNPQl9EYXRlX1RUIiwiQ29icmEgQWRqIENhdGVnb3J5IiwiQ29icmEgQWRqIFR5cGUiLCJFdmVudENvZGUiLCJFdmVudERlc2NyaXB0aW9uIiwiUG9zdGluZ0ZsYWciLCJWYWx1ZURhdGUiLCJCb29rIiwiTm9taW5hbCIsIkluc3RydW1lbnRSZG1JZCIsIkNvdW50ZXJwYXJ0eVJkbUlkIiwiTm9zdHJvUmRtSWQiLCJJbXBlcnNvbmFsIiwiQ3VycmVuY3kiLCJUcmFkZVJlZiIsIkFtb3VudCIsIk5hcnJhdGl2ZSIsIlJldmVyc2VGbGFnIiwiUmV2ZXJzZURhdGUiLCJBbHRQb3N0aW5nRmxhZyIsIkFsdEJvb2siXX0sImFkanVzdG1lbnRfdGVtcGxhdGVfcG9zaXRpb25fYnJlYWtfbGF0ZV90cmFkZSI6eyJuYW1lIjoiYWRqdXN0bWVudF90ZW1wbGF0ZV9wb3NpdGlvbl9icmVha19sYXRlX3RyYWRlLmNzdiIsImNvbHVtbnMiOlsiQ09CX0RhdGVfVFQiLCJDb2JyYSBBZGogQ2F0ZWdvcnkiLCJDb2JyYSBBZGogVHlwZSIsIkV2ZW50Q29kZSIsIkV2ZW50RGVzY3JpcHRpb24iLCJQb3N0aW5nRmxhZyIsIlZhbHVlRGF0ZSIsIkJvb2siLCJOb21pbmFsIiwiSW5zdHJ1bWVudFJkbUlkIiwiQ291bnRlcnBhcnR5UmRtSWQiLCJOb3N0cm9SZG1JZCIsIkltcGVyc29uYWwiLCJDdXJyZW5jeSIsIlRyYWRlUmVmIiwiQW1vdW50IiwiTmFycmF0aXZlIiwiUmV2ZXJzZUZsYWciLCJSZXZlcnNlRGF0ZSIsIkFsdFBvc3RpbmdGbGFnIiwiQWx0Qm9vayJdfSwiYWRqdXN0bWVudF90ZW1wbGF0ZV9wb3NpdGlvbl9icmVha19hY2N1bXVsYXRvciI6eyJuYW1lIjoiYWRqdXN0bWVudF90ZW1wbGF0ZV9wb3NpdGlvbl9icmVha19hY2N1bXVsYXRvci5jc3YiLCJjb2x1bW5zIjpbIkNPQl9EYXRlX1RUIiwiQ29icmEgQWRqIENhdGVnb3J5IiwiQ29icmEgQWRqIFR5cGUiLCJFdmVudENvZGUiLCJFdmVudERlc2NyaXB0aW9uIiwiUG9zdGluZ0ZsYWciLCJWYWx1ZURhdGUiLCJCb29rIiwiTm9taW5hbCIsIkluc3RydW1lbnRSZG1JZCIsIkNvdW50ZXJwYXJ0eVJkbUlkIiwiTm9zdHJvUmRtSWQiLCJJbXBlcnNvbmFsIiwiQ3VycmVuY3kiLCJUcmFkZVJlZiIsIkFtb3VudCIsIk5hcnJhdGl2ZSIsIlJldmVyc2VGbGFnIiwiUmV2ZXJzZURhdGUiLCJBbHRQb3N0aW5nRmxhZyIsIkFsdEJvb2siXX0sImFkanVzdG1lbnRfdGVtcGxhdGVfcmVwcmljZV9mb19wcmljZV96ZXJvIjp7Im5hbWUiOiJhZGp1c3RtZW50X3RlbXBsYXRlX3JlcHJpY2VfZm9fcHJpY2VfemVyby5jc3YiLCJjb2x1bW5zIjpbIkNPQl9EYXRlX1RUIiwiQ29icmEgQWRqIENhdGVnb3J5IiwiQ29icmEgQWRqIFR5cGUiLCJFdmVudENvZGUiLCJFdmVudERlc2NyaXB0aW9uIiwiUG9zdGluZ0ZsYWciLCJWYWx1ZURhdGUiLCJCb29rIiwiTm9taW5hbCIsIkluc3RydW1lbnRSZG1JZCIsIkNvdW50ZXJwYXJ0eVJkbUlkIiwiTm9zdHJvUmRtSWQiLCJJbXBlcnNvbmFsIiwiQ3VycmVuY3kiLCJUcmFkZVJlZiIsIkFtb3VudCIsIk5hcnJhdGl2ZSIsIlJldmVyc2VGbGFnIiwiUmV2ZXJzZURhdGUiLCJBbHRQb3N0aW5nRmxhZyIsIkFsdEJvb2siXX0sImF1ZGl0X3RyYWlsX3RlbXBsYXRlIjp7Im5hbWUiOiJhdWRpdF90cmFpbF90ZW1wbGF0ZS5jc3YiLCJjb2x1bW5zIjpbIkNPQl9EYXRlX1RUIiwiU1A0IiwiUkRNIiwiQ2N5IiwiTVREVHJhZGluZyIsIlR5cGUiLCJCT1BvcyIsIkZPUG9zIiwiUG9zRGlmZiIsIkJPUHJpY2UiLCJGT1ByaWNlIiwiUHJpY2VEaWZmIiwiVGljayIsIkFkanVzdG1lbnRBbW91bnQiLCJCcmVha1R5cGUiLCJBdWRpdFRyYWlsIiwiZmlsZV9wYXRoX3R0Il19LCJhZGp1c3RtZW50X3RlbXBsYXRlX2RjY19leGNlcHRpb24iOnsibmFtZSI6ImFkanVzdG1lbnRfdGVtcGxhdGVfZGNjX2V4Y2VwdGlvbi5jc3YiLCJjb2x1bW5zIjpbIkNPQl9EYXRlX1RUIiwiQ29icmEgQWRqIENhdGVnb3J5IiwiQ29icmEgQWRqIFR5cGUiLCJFdmVudENvZGUiLCJFdmVudERlc2NyaXB0aW9uIiwiUG9zdGluZ0ZsYWciLCJWYWx1ZURhdGUiLCJCb29rIiwiTm9taW5hbCIsIkluc3RydW1lbnRSZG1JZCIsIkNvdW50ZXJwYXJ0eVJkbUlkIiwiTm9zdHJvUmRtSWQiLCJJbXBlcnNvbmFsIiwiQ3VycmVuY3kiLCJUcmFkZVJlZiIsIkFtb3VudCIsIk5hcnJhdGl2ZSIsIlJldmVyc2VGbGFnIiwiUmV2ZXJzZURhdGUiLCJBbHRQb3N0aW5nRmxhZyIsIkFsdEJvb2siXX0sImFkanVzdG1lbnRfdGVtcGxhdGVfZnJlX2V4Y2VwdGlvbiI6eyJuYW1lIjoiYWRqdXN0bWVudF90ZW1wbGF0ZV9mcmVfZXhjZXB0aW9uLmNzdiIsImNvbHVtbnMiOlsiQ09CX0RhdGVfVFQiLCJDb2JyYSBBZGogQ2F0ZWdvcnkiLCJDb2JyYSBBZGogVHlwZSIsIkV2ZW50Q29kZSIsIkV2ZW50RGVzY3JpcHRpb24iLCJQb3N0aW5nRmxhZyIsIlZhbHVlRGF0ZSIsIkJvb2siLCJOb21pbmFsIiwiSW5zdHJ1bWVudFJkbUlkIiwiQ291bnRlcnBhcnR5UmRtSWQiLCJOb3N0cm9SZG1JZCIsIkltcGVyc29uYWwiLCJDdXJyZW5jeSIsIlRyYWRlUmVmIiwiQW1vdW50IiwiTmFycmF0aXZlIiwiUmV2ZXJzZUZsYWciLCJSZXZlcnNlRGF0ZSIsIkFsdFBvc3RpbmdGbGFnIiwiQWx0Qm9vayJdfSwiYWRqdXN0bWVudF90ZW1wbGF0ZV9yZXByaWNlX3N0YXRpY19kYXRhX21pc21hdGNoIjp7Im5hbWUiOiJhZGp1c3RtZW50X3RlbXBsYXRlX3JlcHJpY2Vfc3RhdGljX2RhdGFfbWlzbWF0Y2guY3N2IiwiY29sdW1ucyI6WyJDT0JfRGF0ZV9UVCIsIkNvYnJhIEFkaiBDYXRlZ29yeSIsIkNvYnJhIEFkaiBUeXBlIiwiRXZlbnRDb2RlIiwiRXZlbnREZXNjcmlwdGlvbiIsIlBvc3RpbmdGbGFnIiwiVmFsdWVEYXRlIiwiQm9vayIsIk5vbWluYWwiLCJJbnN0cnVtZW50UmRtSWQiLCJDb3VudGVycGFydHlSZG1JZCIsIk5vc3Ryb1JkbUlkIiwiSW1wZXJzb25hbCIsIkN1cnJlbmN5IiwiVHJhZGVSZWYiLCJBbW91bnQiLCJOYXJyYXRpdmUiLCJSZXZlcnNlRmxhZyIsIlJldmVyc2VEYXRlIiwiQWx0UG9zdGluZ0ZsYWciLCJBbHRCb29rIl19LCJhZGp1c3RtZW50X3RlbXBsYXRlX3JlcHJpY2VfZm9fYm9fcHJpY2VfbmVnYXRpdmUiOnsibmFtZSI6ImFkanVzdG1lbnRfdGVtcGxhdGVfcmVwcmljZV9mb19ib19wcmljZV9uZWdhdGl2ZS5jc3YiLCJjb2x1bW5zIjpbIkNPQl9EYXRlX1RUIiwiQ29icmEgQWRqIENhdGVnb3J5IiwiQ29icmEgQWRqIFR5cGUiLCJFdmVudENvZGUiLCJFdmVudERlc2NyaXB0aW9uIiwiUG9zdGluZ0ZsYWciLCJWYWx1ZURhdGUiLCJCb29rIiwiTm9taW5hbCIsIkluc3RydW1lbnRSZG1JZCIsIkNvdW50ZXJwYXJ0eVJkbUlkIiwiTm9zdHJvUmRtSWQiLCJJbXBlcnNvbmFsIiwiQ3VycmVuY3kiLCJUcmFkZVJlZiIsIkFtb3VudCIsIk5hcnJhdGl2ZSIsIlJldmVyc2VGbGFnIiwiUmV2ZXJzZURhdGUiLCJBbHRQb3N0aW5nRmxhZyIsIkFsdEJvb2siXX19fSwiZGF0ZXMiOlt7ImJ1c2luZXNzX2RhdGUiOiIyMDE5LTA1LTMxIiwibmV4dF9idXNpbmVzc19kYXRlIjoiMjAxOS0wNi0wMSIsInByZXZfYnVzaW5lc3NfZGF0ZSI6IjIwMTktMDUtMzAiLCJyZWNvbl9wcm9jZXNzaW5nX3V1aWQiOiJlNmY0NzMxNi1jNjJmLTRlNjMtOGExYy01OGUwZDUxZjM2YWYifV0sIm1hdGNoX2NvbHMiOnt9LCJhZ2dfY29scyI6e30sImJyZWFrcyI6WyJSZXByaWNlQnJlYWtSRE1VcERvd24iLCJSZXByaWNlQnJlYWtGT1ByaWNlWmVybyIsIlJlcHJpY2VCcmVha0ZPQk9QcmljZU5lZ2F0aXZlIiwiUmVwcmljZUJyZWFrU3RhdGljRGF0YU1pc21hdGNoIiwiUG9zaXRpb25CcmVhayIsIlBvc2l0aW9uQnJlYWtMYXRlVHJhZGVzIiwiUG9zaXRpb25CcmVha0FjY3VtdWxhdG9ycyIsIlRyYWRlUHJpY2VCcmVhayIsIkZSRUV4Y2VwdGlvbkJyZWFrIiwiRGVyaXZhdGl2ZXNDYXNoQ29udHJvbEJyZWFrIiwiU3lzdGVtRmVlZEVycm9yQnJlYWsiLCJORklLQ2FzaEZhaWxzQnJlYWsiLCJVbmtub3duIl0sInJlY29uX3V1aWQiOiI3ZTdkM2YwYi0zMjI1LTQyNWMtOTY0OC02OTYyODg3ZmFjZDUiLCJqb2JfdXVpZCI6IjM3N2EzMWNkLWJmODYtNGFmMy04YzIxLTI4MzQxOTFiNmRlZCJ9"

    println(decode(encodedString))
  }
}
